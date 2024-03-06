package projetografico.application;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import projetografico.model.Contato;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoIdade;
	private JTextField campoTelefone;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tela de Cadastro");
		lblTitulo.setForeground(new Color(28, 113, 216));
		lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(288, 12, 241, 35);
		contentPane.add(lblTitulo);
		
		JLabel lblNome = new JLabel("nome:");
		lblNome.setBounds(12, 94, 70, 15);
		contentPane.add(lblNome);

		JLabel lblIdade = new JLabel("idade:");
		lblIdade.setBounds(12, 138, 70, 15);
		contentPane.add(lblIdade);
		
		JLabel lblFone = new JLabel("fone:");
		lblFone.setBounds(12, 184, 70, 15);
		contentPane.add(lblFone);
		
		campoNome = new JTextField();
		campoNome.setBounds(64, 92, 114, 19);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoIdade = new JTextField();
		campoIdade.setBounds(64, 136, 114, 19);
		contentPane.add(campoIdade);
		campoIdade.setColumns(10);
		
		campoTelefone = new JTextField();
		campoTelefone.setBounds(64, 182, 114, 19);
		contentPane.add(campoTelefone);
		campoTelefone.setColumns(10);
	
		JButton btnExecuta = new JButton("executa");
		btnExecuta.setBackground(new Color(98, 160, 234));
		btnExecuta.setIcon(new ImageIcon(Tela.class.getResource("/projetografico/imgs/okay.png")));
		btnExecuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				popularTabela(campoNome,campoIdade,campoTelefone,table);
				
				limparTabela(campoNome, campoIdade, campoTelefone);
				
			}
		});
		
		btnExecuta.setBounds(12, 326, 154, 92);
		contentPane.add(btnExecuta);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(259, 67, 491, 290);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Idade", "Telefone"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("carregar dados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarCampos(campoNome,campoIdade,campoTelefone,table);
			}
		});
		btnNewButton.setBounds(12, 272, 154, 25);
		contentPane.add(btnNewButton);
	
	}
	
	public static void popularTabela(JTextField nome, JTextField idade, JTextField fone,JTable table) {
		String nomeInput = nome.getText();
		Integer idadeInput = !idade.getText().equals("")? 
									Integer.parseInt(idade.getText()) : null;
		String telefoneInput = fone.getText();
		
		if(!nomeInput.equals("") && idadeInput != null && !telefoneInput.equals("")) {
			Object[] linha = {nomeInput,idadeInput,telefoneInput};
			
			((DefaultTableModel) table.getModel()).addRow(linha);		
		}
		else {
			JOptionPane.showMessageDialog(table, "Todos os campos precisam estar preenchidos");
		}
			
	}
	
	public static void limparTabela(JTextField nome, JTextField idade, JTextField fone) {
		nome.setText("");
		idade.setText("");
		fone.setText("");
	}
	
	public static void carregarCampos(JTextField nome,JTextField idade, JTextField fone,JTable table) {
		
		Integer indice = table.getSelectedRow();
		
		Contato c = new Contato();
		
		c.setNome(table.getValueAt(indice, 0).toString());
		c.setIdade((int)table.getValueAt(indice, 1));
		c.setTelefone(table.getValueAt(indice,2).toString());
		
		nome.setText(c.getNome());
		idade.setText(c.getIdade().toString());
		fone.setText(c.getTelefone());
		
		System.out.println(c);
	}
}

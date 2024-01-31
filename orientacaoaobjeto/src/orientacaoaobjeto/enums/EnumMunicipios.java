package orientacaoaobjeto.enums;

public enum EnumMunicipios {
	
	FORTALEZA("Fortaleza"),
	GUARAMIRANGA("Guaramiranga"),
	CAUCAIA("Caucaia"),
	SOBRAL("Sobral"),
	MARANGUAPE("Maranguape"),
	ABAIARA("Abaiara"),
	ARNEIROZ("Arneiroz"),
	ICAPUI("Icapuí");

	private String descricao;
	
	EnumMunicipios(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}

package trabalho;

public class Data {
	
	private String date;
	private int dia, mes, ano;
	
	private Data() {}
	public Data(String date) {//metodo construtor 
		this.date=date;
		this.dia=computeTime(date)[0];
		this.mes=computeTime(date)[1];
		this.ano=computeTime(date)[2];

	}
	
    private int[] computeTime(String date){ // metodo para reduzir cada parcela da data a um inteiro
		int[] data = new int[3];
		int i=0;
		for(String str : date.split("/")) {
			data[i++]=Integer.parseInt(str);
			return data;
		}
		return data;

	}
	
    public int getDia() {return dia;}
    public int getMes() {return mes;}    
    public int getAno() {return ano;}
}

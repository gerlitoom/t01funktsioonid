/*
Teisendab kilomeetrid miilideks ja ümardab
Ette antud arv on 10 ja 4 komakohta
*/

public class kodutoo1{
	static double miilideks(double kilomeetrid){
		return kilomeetrid*0.621371;
	}
	static double ymardaTsykliga(double arv, int kohtadearv){
		double kordaja=1;
		for(int i=0; i<kohtadearv; i++){
			kordaja*=10;
		}
		return Math.round(arv*kordaja)/kordaja;
	}
	static double ymardaAstendades(double arv, int kohtadearv){
		return Math.round(arv*Math.pow(10, kohtadearv))/
		                      Math.pow(10, kohtadearv);
	}
	static double ymarda(double arv, int kohtadearv){
//		return ymardaTsykliga(arv, kohtadearv);
		return ymardaAstendades(arv, kohtadearv);
	}
	public static void main(String[] args){
		System.out.println(ymarda(miilideks(10), 4));
	}	
}

/*
[gerltoom@greeny t01funktsioonid]$ java kodutoo1
6.2137
*/
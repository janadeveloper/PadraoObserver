
public class MediaDisplay implements Observer {
		private Subject subject;
	    private float temperaturaMin, temperaturaMax, temperaturaMed;
	    private float umidadeMin, umidadeMax, umidadeMed;
	    private float pressaoMin, pressaoMax, pressaoMed;
	    
	    
	    public MediaDisplay( Subject subject ){
	        this.subject = subject;
	        this.subject.addObserver(this);
	    }
	    
	    
	    public void display(){
	        System.out.println("Temperatura média: "+temperaturaMed);
	        System.out.println("Umidade média: "+umidadeMed);
	        System.out.println("Pressão média: "+pressaoMed);
	    }

		@Override
		public void update(float temperatura, float umidade, float pressao) {
			  mediaTemperatura( temperatura );
		      mediaUmidade( umidade );
		      mediaPressao( pressao );
		        display();
			
		}
}

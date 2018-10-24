
public class PressaoAtmosfericaDisplay implements Observer{
		private Observable subject;
	  	private float temperatura;
	    private float pressao;

	    public PressaoAtmosfericaDisplay( Observable subject ){
	        this.subject = subject;
	        this.subject.addObserver(this);
	    } 
	    
	    public void display(){
	        System.out.println( "Pressão atmosférica: "+calcPressaoAtmosferica() );
	    }

		@Override
		public void update(float temperatura, float umidade, float pressao) {
			 this.temperatura = temperatura;
		     this.pressao = pressao;
		     display();
			
		}
		
		 public void update(Observable observable, Object data) {
		        EstacaoMetereologica estacao = (EstacaoMetereologica) observable;
		        
		        this.temperatura = estacao.getTemperatura();
		        this.pressao = estacao.getPressao();
		        display();
		    }
}

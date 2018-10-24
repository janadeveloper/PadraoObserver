
public class EstatisticasDisplay implements Observer {
		private Subject subject;
		private float temperatura;
		private float umidade;
		private float pressao;
		
		 public EstatisticasDisplay( Subject subject ){
		        this.subject = subject;
		        this.subject.addObserver( this );
		    }
		
		private void display(){
	        System.out.println("Temperatura: "+temperatura);
	        System.out.println("Umidade: "+umidade);
	        System.out.println("Pressao: "+pressao);
	    }

		@Override
		public void update(float temperatura, float umidade, float pressao) {
			 this.temperatura = temperatura;
		        this.umidade = umidade;
		        this.pressao = pressao;
		        display();
		}
		
}

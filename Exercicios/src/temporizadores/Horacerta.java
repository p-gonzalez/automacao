package temporizadores;

import java.util.Date;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless

public class Horacerta {
	@Schedule(second="15", minute="22", hour="10")
	public void showTime() {
		System.out.println(new Date());
		
	}
	

}

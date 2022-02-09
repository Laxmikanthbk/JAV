import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class bean {
	
	@Bean
	public student getStudent() {
		student s=new student();
		s.setMarks(getMarks());
		return s;
		
	}
	
	@Bean
	public marks getMarks(){
		return new marks();
		
	}
}
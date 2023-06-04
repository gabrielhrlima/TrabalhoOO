package trabalho;

import java.time.Duration;
import java.time.LocalDateTime;

public class Duracao {

	private String dateIn, dateOut, timeIn, timeOut ;
	Data dataEntrada = new Data(dateIn);
	Data dataSaida = new Data(dateOut);
	Horario horarioEntrada = new Horario(timeIn);
	Horario horarioSaida =new Horario(timeOut);
	
	
	public Duration calcDiferenca(Data dataEntrada, Horario horarioEntrada, Data dataSaida, Horario horarioSaida) {
		LocalDateTime entrada = LocalDateTime.of(2023, dataEntrada.getMes(), dataEntrada.getDia(), horarioEntrada.getHora(), horarioEntrada.getMinuto());
        LocalDateTime saida = LocalDateTime.of(2023, dataSaida.getMes(), dataSaida.getDia(), horarioSaida.getHora(), horarioSaida.getMinuto());
       
        
        return Duration.between(entrada, saida);
	}
}

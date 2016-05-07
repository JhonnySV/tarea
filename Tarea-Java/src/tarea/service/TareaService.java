package tarea.service;
import tarea.dto.TareaDto;
/**
 *
 * @author JHONNY
 */
public class TareaService {
        double promedio;
        
        public void promedio(TareaDto dto){
        int cuantos = dto.getCuantos();
        promedio=(dto.getNumero1()+dto.getNumero2()+dto.getNumero3()+dto.getNumero4()+dto.getNumero5())/cuantos;
        dto.setPromedio(promedio);
        }
}
package farmaciadespertad;
import java.time.LocalDate; 
import java.util.*;
public class Producto 
{
    private static List<Integer> Productos = new ArrayList<Integer>();
    private String nombre = "";
    private String marca = "";
    private int cantidades_disponibles = 0;
    private LocalDate fecha_vencimiento = null;
    private double precio = 0.0D;
    private enum TipoMedicamento
    {
        Liquido,
        Pastilla,
        Ampollas_Bebibles,
        Inyecciones,
        NoEspeceficado
    };
    private TipoMedicamento tipo = TipoMedicamento.NoEspeceficado;
    
    // Getters
    public String getNombre() {
    return nombre;
    }
    
    public String getMarca() {
    return marca;
    }
    
    public int getCantidadesDisponibles() {
    return cantidades_disponibles;
    }
    
    public LocalDate getFechaVencimiento() {
    return fecha_vencimiento;
    }
    
    public double getPrecio() {
    return precio;
    }
    
    public TipoMedicamento getTipoMedicamento() {
    return tipo;
    }
    // Setters
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public void setMarca(String marca) {
      this.marca = marca;
    }
    
    public void setCantidadesDisponibles(int cantidades_disponibles) {
      this.cantidades_disponibles = cantidades_disponibles;
    }
    
    public void setFechaVencimiento( LocalDate fecha_vencimiento) {
      this.fecha_vencimiento = fecha_vencimiento;
    }
    
    public void setPrecio(double precio) {
      this.precio = precio;
    }
   
    public void setTipoMedicamento(TipoMedicamento tipo) {
      this.tipo = tipo;
    }
    public Producto(String marca){
        
    }

    
}

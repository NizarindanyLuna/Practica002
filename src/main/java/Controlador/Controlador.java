package Controlador;

import modelo.Automovil;
import vista.dlgAutomoviles;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Controlador implements ActionListener{
    
    private Automovil Auto;
    private dlgAutomoviles vista;
    
    public Controlador(Automovil Auto,dlgAutomoviles vista){
        
        this.Auto=Auto;
        this.vista=vista;
        
        //Hacer que el controlador ESCUCHE los botones de la vista
        vista.btnNuevo.addActionListener(this);
        vista.btnMostrar.addActionListener(this);
        vista.btnGuardar.addActionListener(this);
        vista.btnCancelar.addActionListener(this);
        vista.btnCerrar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        
    }
    
    private void iniciarVista(){
        vista.setTitle(":: Automoviles ::");
        vista.setSize(550,600);
        vista.setVisible(true);
        
    }
    
    private void limpiar(){
        vista.txtDescripcionA.setText("");
        vista.txtNumC.setText("");
        vista.txtPInicial.setText("");
        vista.txtPMensual.setText("");
        vista.txtPrecio.setText("");
        vista.txtPorcentajeI.setText("");
        vista.txtTotFinanciar.setText("");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        
        if(e.getSource()==vista.btnNuevo){
            vista.btnGuardar.setEnabled(true);
            vista.btnMostrar.setEnabled(true);
            vista.btnLimpiar.setEnabled(true);
            vista.btnCancelar.setEnabled(true);
            vista.btnCerrar.setEnabled(true);
            vista.txtNumC.enable(true);
            vista.txtDescripcionA.enable(true);
            vista.txtPrecio.enable(true);
            vista.txtPorcentajeI.enable(true);
            vista.BoxPlazo.enable(true);        
            vista.txtPInicial.enable(false);
            vista.txtTotFinanciar.enable(false);
            vista.txtPMensual.enable(false);
        }
        
        if(e.getSource()==vista.btnMostrar){
            vista.txtNumC.setText((Auto.getNumC()));
            vista.txtDescripcionA.setText((Auto.getDescripcionA()));
            vista.txtPrecio.setText(Float.toString(Auto.getPrecio()));
            vista.txtPorcentajeI.setText(Float.toString(Auto.getPorcentajeI()));
            
            vista.txtTotFinanciar.setText(Float.toString(Auto.CalcularTotFinanciar()));
            vista.txtPInicial.setText(Float.toString(Auto.CalcularPInicial()));
            vista.txtPMensual.setText(Float.toString(Auto.CalcularPMensual()));
        }
        
        if(e.getSource()==vista.btnGuardar){
            Auto.setNumC(vista.txtNumC.getText());
            Auto.setDescripcionA(vista.txtDescripcionA.getText());
            
            try{
            Auto.setPrecio(Float.parseFloat(vista.txtPrecio.getText()));
            Auto.setPorcentajeI(Float.parseFloat(vista.txtPorcentajeI.getText()));
            Auto.setPlazo(Integer.parseInt(vista.BoxPlazo.getSelectedItem().toString()));
            
            JOptionPane.showMessageDialog(vista, "Se agredo de manera exitosa");
            limpiar();
            } catch(NumberFormatException ex){
                
                JOptionPane.showMessageDialog(vista, "Surgio el siguiente error: "+ ex.getMessage());
                
            }
                catch(Exception ex2){
                    JOptionPane.showMessageDialog(vista, "Surgio el siguiente error: "+ex2.getMessage());
                }
        }
        
        if(e.getSource()==vista.btnLimpiar){
            limpiar();
        }
        
        if(e.getSource()==vista.btnCerrar){
            
            int option=JOptionPane.showConfirmDialog(vista, "¿Desea salir?","Decidir",
                    JOptionPane.YES_NO_OPTION);
            if(option==JOptionPane.YES_NO_OPTION){
                vista.dispose();
                System.exit(0);
                
            }
            
        }
        
        if(e.getSource()==vista.btnCancelar){
            limpiar();
            
            vista.btnCancelar.setEnabled(true);
            vista.btnCerrar.setEnabled(true);
            vista.btnLimpiar.setEnabled(true);
            vista.btnNuevo.setEnabled(true);
            vista.btnGuardar.setEnabled(false);
            vista.btnMostrar.setEnabled(false);
            vista.txtNumC.enable(false);
            vista.txtDescripcionA.enable(false);
            vista.txtPrecio.enable(false);
            vista.txtPorcentajeI.enable(false);
            vista.BoxPlazo.enable(false);       //plazopendiente
            vista.txtPInicial.enable(false);
            vista.txtTotFinanciar.enable(false);
            vista.txtPMensual.enable(false);
        }
        
    }

    public static void main(String[] args) {
        Automovil Auto= new Automovil();
        dlgAutomoviles vista=new dlgAutomoviles();
      
        Controlador contro=new Controlador(Auto, vista);
        contro.iniciarVista();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemasEmpotrados.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chavita
 */
public class Connect {
    private CommPortIdentifier idPort;
    private SerialPort serial;
    private InputStream input;
    private OutputStream output;
    
    public void connect(String port){
        try {
            idPort = CommPortIdentifier.getPortIdentifier(port);
        } catch (NoSuchPortException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            serial = (SerialPort) idPort.open("Demo", 5000);
        } catch (PortInUseException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }    
        try {
            setSerialPortParameters();
        } catch (IOException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            input = serial.getInputStream();
        } catch (IOException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            output = serial.getOutputStream();
        } catch (IOException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }
    
    private void setSerialPortParameters() throws IOException {
        int baudRate = 9600; // 57600bps

        try {
            // Set serial port to 57600bps-8N1..my favourite
            serial.setSerialPortParams(
                    baudRate,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);

            serial.setFlowControlMode(
                    SerialPort.FLOWCONTROL_NONE);
        } catch (UnsupportedCommOperationException ex) {
            throw new IOException("Unsupported serial port parameter");
        }
    }
    
    public OutputStream getOutput(){
        return output;
    
    }
    
    public InputStream getInput(){
        return input;
    
    
    }
    
    public void cerrarPuerto(){
        serial.close();
        input = null;
        output = null;
    }

}

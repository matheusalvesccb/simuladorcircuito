/*
 *  Fórmulas
    Corrente    > i = U / R || i = P / U  || i² = P / R
    Resistencia > R = U / i || R = P / i² || R = U² / P
    Voltagem    > U = R . i || U² = P . R || U = P / i
    Potência    > P = U . i || P = U² / R || P  = R . i²
    
    Corrente = 3
    Resistencia = 32
    Voltagem = 96
    Pot = 288
 */
package simuladorcircuito;
        
/**
 * 
 * @author Matheus
 */
public abstract class Circuito {
    private Integer Codigo;

    private Double Corrente;

    private Double Resistencia;

    private Double Voltagem;

    private Double Potencia;

    private Integer QuantidadeResistores;

    public void CalcularCorrente() {

    }

    public void CalcularResistencia() {

    }

    public void CalcularVoltagem() {

    }

    public void CalcularPotencia() {

    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public Double getCorrente() {
        return Corrente;
    }

    public void setCorrente(Double Corrente) {
        this.Corrente = Corrente;
    }

    public Double getResistencia() {
        return Resistencia;
    }

    public void setResistencia(Double Resistencia) {
        this.Resistencia = Resistencia;
    }

    public Double getVoltagem() {
        return Voltagem;
    }

    public void setVoltagem(Double Voltagem) {
        this.Voltagem = Voltagem;
    }

    public Double getPotencia() {
        return Potencia;
    }

    public void setPotencia(Double Potencia) {
        this.Potencia = Potencia;
    }

    public Integer getQuantidadeResistores() {
        return QuantidadeResistores;
    }

    public void setQuantidadeResistores(Integer QuantidadeResistores) {
        this.QuantidadeResistores = QuantidadeResistores;
    }
}
package com.example.atividade3;

public class Contabancaria {
   private String Banco;
    private String Agencia;
    private String NumeroDaConta;
    private String TipodeConta;
    private String Saldoatual;
    private String LimiteDisponivel;

 public Contabancaria(String banco, String agencia, String numeroDaConta, String tipodeConta, String saldoatual, String limiteDisponivel) {
  Banco = banco;
  Agencia = agencia;
  NumeroDaConta = numeroDaConta;
  TipodeConta = tipodeConta;
  Saldoatual = saldoatual;
  LimiteDisponivel = limiteDisponivel;
 }

 public String getBanco() {
  return Banco;
 }

 public void setBanco(String banco) {
  Banco = banco;
 }

 public String getAgencia() {
  return Agencia;
 }

 public void setAgencia(String agencia) {
  Agencia = agencia;
 }

 public String getNumeroDaConta() {
  return NumeroDaConta;
 }

 public void setNumeroDaConta(String numeroDaConta) {
  NumeroDaConta = numeroDaConta;
 }

 public String getTipodeConta() {
  return TipodeConta;
 }

 public void setTipodeConta(String tipodeConta) {
  TipodeConta = tipodeConta;
 }

 public String getSaldoatual() {
  return Saldoatual;
 }

 public void setSaldoatual(String saldoatual) {
  Saldoatual = saldoatual;
 }

 public String getLimiteDisponivel() {
  return LimiteDisponivel;
 }

 public void setLimiteDisponivel(String limiteDisponivel) {
  LimiteDisponivel = limiteDisponivel;
 }

 @Override
 public String toString() {
  return "Contabancaria{" +
          "Banco='" + Banco + '\'' +
          ", Agencia='" + Agencia + '\'' +
          ", NumeroDaConta='" + NumeroDaConta + '\'' +
          ", TipodeConta='" + TipodeConta + '\'' +
          ", Saldoatual='" + Saldoatual + '\'' +
          ", LimiteDisponivel='" + LimiteDisponivel + '\'' +
          '}';
 }
}

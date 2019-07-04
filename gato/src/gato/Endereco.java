/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 * @author Joao Felipe
 */
public class Endereco {
        private String rua;
        private int numero;
        private String complemento;
        private String bairro;
        private String referencia;
        private String cidade;
        private int CPF;

        /**
         * @return the rua
         */
        public String getRua() {
            return rua;
        }

        /**
         * @param rua the rua to set
         */
        public void setRua(String rua) {
            this.rua = rua;
        }

        /**
         * @return the numero
         */
        public int getNumero() {
            return numero;
        }

        /**
         * @param numero the numero to set
         */
        public void setNumero(int numero) {
            this.numero = numero;
        }

        /**
         * @return the complemento
         */
        public String getComplemento() {
            return complemento;
        }

        /**
         * @param complemento the complemento to set
         */
        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        /**
         * @return the bairro
         */
        public String getBairro() {
            return bairro;
        }

        /**
         * @param bairro the bairro to set
         */
        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        /**
         * @return the referencia
         */
        public String getReferencia() {
            return referencia;
        }

        /**
         * @param referencia the referencia to set
         */
        public void setReferencia(String referencia) {
            this.referencia = referencia;
        }

        /**
         * @return the cidade
         */
        public String getCidade() {
            return cidade;
        }

        /**
         * @param cidade the cidade to set
         */
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        /**
         * @return the CPF
         */
        public int getCPF() {
            return CPF;
        }

        /**
         * @param CPF the CPF to set
         */
        public void setCPF(int CPF) {
            this.CPF = CPF;
        }
}

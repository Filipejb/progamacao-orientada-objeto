package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    

    @Test
    public void testDizerOla(){
        Pessoa pessoa = new Pessoa();
        String saudacao = pessoa.dizerOla();
        assertEquals("Ola",saudacao);
    }
    
}


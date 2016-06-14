package io.swift.kata;

import org.junit.Before;
import org.junit.Test;
public class EmailServiceTest {

    private EmailService emailService;

    @Before
    public void setup() {
        //hint mock()
    }

    @Test
    public void writeEmailUsingEmail_requestsEmailOutputterToWriteEmail() {
        //hint verify
    }

    @Test
    public void writeEmailUsingEmail_returnsTheValueReturnedByEmailOutputter() {
        //hint when.thenReturn
    }

    @Test
    public void writeEmailUsingConstructedEmail_requestsEmailOutputterToWriteTheConstructedEmail() {
        //hint verify with argument captor / eq()
    }

    @Test
    public void writeEmailUsingConstructedEmail_returnsTheValueReturnedByEmailOutputter() {
        //hint did you use any() earlier?
    }

    @Test
    public void writeEmailUsingGeneratedEmail_requestsEmailFromEmailGenerator() {
        //hint but don't use any now!!!
    }

    @Test
    public void writeEmailUsingGeneratedEmail_returnsTrue_whenEmailGeneratorThrowsEmailException() {
        //hint when.thenThrow
    }

    @Test
    public void writeEmailUsingGeneratedEmail_requestsEmailOutputterToWriteGeneratedEmail() {
        //hint when.thenReturn verify
    }

    @Test
    public void writeEmailUsingGeneratedEmail_retrunsTheValueReturnedByEmailOutputter() {
        //hint it might be as easy as any()...
    }
}

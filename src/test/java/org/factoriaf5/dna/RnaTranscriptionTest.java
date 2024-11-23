package org.factoriaf5.dna;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RnaTranscriptionTest {

    private RnaTranscription rnaTranscription;

    @BeforeEach
    public void setUp() {
        rnaTranscription = new RnaTranscription();
    }

    @Test
    public void testEmptyRnaSequence() {
        assertThat(rnaTranscription.transcribe("").isEmpty(), is(true));
    }

    //@Disabled("Remove to run test")
    @Test
    public void testRnaTranscriptionOfCytosineIsGuanine() {
        assertThat(rnaTranscription.transcribe("C"), is(equalTo("G")));
    }

    //@Disabled("Remove to run test")
    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
        assertThat(rnaTranscription.transcribe("G"), is(equalTo("C")));
    }

    //@Disabled("Remove to run test")
    @Test
    public void testRnaTranscriptionOfThymineIsAdenine() {
        assertThat(rnaTranscription.transcribe("T"), is(equalTo("A")));
    }

    //@Disabled("Remove to run test")
    @Test
    public void testRnaTranscriptionOfAdenineIsUracil() {
        assertThat(rnaTranscription.transcribe("A"), is(equalTo("U")));
    }

    //@Disabled("Remove to run test")
    @Test
    public void testRnaTranscription() {
        assertThat(rnaTranscription.transcribe("ACGTGGTCTTAA"), is(equalTo("UGCACCAGAAUU")));
    }
}
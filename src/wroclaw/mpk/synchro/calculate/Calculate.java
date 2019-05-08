package wroclaw.mpk.synchro.calculate;

import wroclaw.mpk.synchro.structure.MpkSynchro;

import java.io.IOException;

public class Calculate {

    public static void main(String [] args)  {

        MpkSynchro synchro = new MpkSynchro();

        try {
            synchro.doSynchroCalculate();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }






}

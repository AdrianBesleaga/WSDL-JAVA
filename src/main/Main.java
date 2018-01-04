package main;

import uaic.webnpchunkerro.NpChunkerRoWS;
import uaic.webnpchunkerro.NpChunkerRoWS_Service;

public class Main {

    public static void main(String[] args) {
        String text = "Strada era pustie și întunecată și, în ciuda verii, în urma unor ploi generale, răcoroasă și foșnitoare ca o pădure.";
        NpChunkerRoWS_Service npChunkerRoWS_service = new NpChunkerRoWS_Service();
        NpChunkerRoWS npChunkerRoWS = npChunkerRoWS_service.getNpChunkerRoWSPort();
        System.out.println(npChunkerRoWS.chunkText(text));
    }
}

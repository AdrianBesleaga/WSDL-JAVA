package uaic.webnpchunkerro;

public class Main {

    public static void main(String[] args) {
        NpChunkerRoWS_Service npChunkerRoWS_service = new NpChunkerRoWS_Service();
        NpChunkerRoWS npChunkerRoWS = npChunkerRoWS_service.getNpChunkerRoWSPort();
        System.out.println(npChunkerRoWS.chunkText("raluca a castigat").toString());

    }


}

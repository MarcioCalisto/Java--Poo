// package edu.marcio;

// public class ConverteData {
//     int vDia = vBD_Data.substring.(8, 2);
//     int vMes = vBD_Data.substring.(5, 2);
//     int vAno = vBD_Data.substring.(0, 4);

//     public void fConverteData(String vData){
//         String vBD_Data = "2015/07/01";
//         String vData = fConverteData(vBD_Data);
//     }

//     public static void main(String[] args) {
//         ConverteData ex = new ConverteData();
//         ex.fConverteData(vData);
//     }
// } Minha tentativa.

// Correção..

package edu.marcio.atividades;

public class ConverteData {

    public String fConverteData(String vBD_data) {

        // Conversão para int é usado o interge.parseInt
        int vDia = Integer.parseInt(vBD_data.substring(8, 10));
        int vMes = Integer.parseInt(vBD_data.substring(5, 7));
        int vAno = Integer.parseInt(vBD_data.substring(0, 4));

        return String.format("%02d/%02d/%04d", vDia, vMes, vAno);
    }

    public static void main(String[] args) {
        ConverteData ex = new ConverteData();
        String vBD_data = "2015/07/01";
        String vData = ex.fConverteData(vBD_data);
        System.out.println(vData); // Saida esperada: 01/07/2015
    }
}

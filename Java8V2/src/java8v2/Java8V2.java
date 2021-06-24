/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8v2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Java8V2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws Exception{
         Scanner sc = new Scanner(System.in);
         
              menu();
              
         
}
    static void menu()throws Exception{
        Scanner sc = new Scanner(System.in);
        int x=9;
        while (x!=0) {
                    System.out.print("-- faites votre choix --" +"\n"
                    +"1: Crypter le fichier" +"\n"
                    +"2: Décrypter le fichier"+ "\n"
                    +"0: Exit"+ "\n");  

        x = sc.nextInt();
            switch (x){

                case 1:
                    crypter();
                    break;

                case 2:
                    deCrypter();
                    break;
                    
                case 0:
                    break;
                    
                default:
                    System.out.println("vous n'avez rien choisi");
            } 
        } 
    }
    
     //Fonction de Lire et Afficher le fichier
    public static List<String> textReader() throws Exception {

    BufferedReader source;
    String chemin_de_ficher="";
    String ligne;
    Scanner sc = new Scanner(System.in);
    List<String> lignes = new ArrayList<String>();
    
        while (chemin_de_ficher!= null) {            
                System.out.println("Saisir le nom de ficher à Crypter");    
                chemin_de_ficher= sc.nextLine();
            }
      
            source = new BufferedReader(new FileReader(chemin_de_ficher));
            ligne = source.readLine();
        while (ligne != null) {
            lignes.add(ligne);
            System.out.println(ligne);
            ligne = source.readLine();
        }
            return lignes;
}


 
     //Procedure d'affichage 
public static void affichage()throws Exception{
    
    //textReader();
   
}

//Procedure de Ecriture de fichier (apres Cryptage/Décryptage)
public static void textWriter () throws Exception{
 /*BufferedWriter cible;
 cible = new BufferedWriter(new FileWriter(nomFichier));
 for (int i = 0; i < lignes.size(); i ++) {
 cible.write(lignes.get(i) + "\n");
 }
 cible.close(); */
}

public static void crypter()throws Exception {
    Scanner sc = new Scanner(System.in);
    List<String> des_lignes = new ArrayList<String>(); 
        String cle;
        System.out.println("Saisi la Clé de Cryptage: ");
        cle = sc.nextLine();
        
        
     //recupérer les lignes dans une Array de Type String(des_Ligne)
     des_lignes = textReader();

    }

public static List<String> Calule()throws Exception{

}

private static void deCrypter() {
   
        System.out.println("je suis dans la Procedure decrypter ");
}





 

/*
---------------------------------- Cryper le fichier ---------------------------
1 ... Cryper le fichier
2 ... Décryper le fichier
0 ... Quitter
1
Saisie de la clé de cryptage :
AzertY
Saisie du nom du fichier à crypter (c:/dossier/source.txt) :
m:/TP_Java/source.txt
Saisie du nom du fichier crypté (c:/dossier/crype.txt) :
m:/TP_Java/crypte.txt
Voici le fichier crypté :
™¹³Ó³Çé
ᾐCrÃ¾Ò¹ÍßÅ”å•á×Ö…•×ééÖOÇÅÑjÍÛ•›ÔÝÜÓÊÊN¾ÙêÎh
¶¨£Æ¿Ã¿ÄêÊžá
±›•ÇpÂ¯•ÙÉ•ãØéäÈ…¤ãíç•››ÀμÙjÅ`×”ßÞåâÈ×NéæÙ•›ŸÄ¼ÈÂêÊžá•ØáÐÕš]ìÙ•«¤½pÑ¯ÑèÆ•×•éáØÙNäÙæá£”t´
ÄjÄÛ• èÔ•àÒÚ¡”ÙêÜ¨¢tÆÔjÅ×Ï¢“ÒÚ’ÆÔ£æë •§Áμ•½Ê–Ö•Ø•ÜäÄÓ’Ù˜äÎ¬£½μ•®Æ–ÍVÔßåÞÌÈ•èáãÛZ”ÇÄ•¹ÓßÆ•
çYÚÖÔ£ç¥äß©Æ±Ì·Æé”ç•Ü×ÖÙ—ãæ”ÑŸ¢t³Î¶ÍÛÄ£ÜÞãå‘
¹aÄÀË³Ä×Õ˜âÝ•ÕÒÓ¡ÝëèÒZt³ÑÃÑêÆ¡“Ôé’ÇO‘æñäáŸ¡tÅÍjÕÛÙ£Øè×ÏÔoe”äÕ§È¸Î®Æ–Å¤“‘¸ÚÌË”æÙÛÒZ“¹pÂ4Ô×ÓQ“
—Ýæ×Õh£§ëä±]·ÂØºÕ×È”¡ÞçÙ’È–ÝÞÚßŸ\·μÒ«Ó¤É£àÛž ƒ®š”ë›Î¡˜ÈpÁ³ÆäéØÙ×ÐÒ“âì”Ý¦¤ÇpÃqÖäŸåYé×ÛÙ“”ééÒZ“
{ÅÍ¯èKßØèÓ×Îâ˜ãÝ$¡μÄÈ¹ÏäÆ›ßÔ£’¯OEÖâÙÐ®˜ºpÄ½Õ–Å”“ÒäßÓ×“âÜæÒZ¤ÂμºÓåÃ›]ÜÖæÌÖ£Ù¤”Ña”ÂpÏ¶ÂäÊ•ÜÔç’
ÏÊ¡”ÜÝÓ ÆμÍ¾ÆéçÐå×Ö…“è˜ÙÛ ˜ÂpÃ¯âÂOÖÞÙ×Õ…“â˜éá£›½ÃÀ¸Õ–Â¤“ßáçÖ…“è˜ÕâZoe½μÔÂâÆO×YØáØÕÛÝ”Ò¨OÄÂÎKÚÖ
¡Øâ•××…”ãæ×á£ÂÃ
°¢˜º¶Ñ«ÈÛ“Ø¸\ÖÆ
1 ... Cryper le fichier
2 ... Décryper le fichier
0 ... Quitter
0
fin
}

----------------------------------Décryper le fichier---------------------------
1 ... Cryper le fichier
2 ... Décryper le fichier
0 ... Quitter
2
Saisie de la clé de cryptage :
AzertY
Saisie du nom du fichier à décrypter (c:/dossier/crypte.txt) :
m:/TP_Java/crypte.txt
Saisie du nom du fichier décrypté (c:/dossier/decrype.txt) :
m:/TP_Java/decrypte.txt
Voici le fichier décrypté :
Objectifs
Consolider les acquis sur le langage Java.
Introduction
Dans ce chapitre vous allez développer une application complète qui reprend tout partie de ce que
nous avons vu dans ce cours, même si une grande partie de l'application est orientée sous-programmes
et gestion des collections.
L'application consiste à crypter et décrypter un texte selon la méthode du "Chiffrage de césar" 
(http://www.cryptage.org/chiffre-cesar.html). Il s'agit bien évidemment plus d'un prétexte que d'une 
réalisation opérationnelle. L'objectif est de comprendre une problématique, d'en planifier les différentes 
étapes et enfin de la coder en utilisant au plus et au mieux le découpage en procédures et fonctions.
1 ... Cryper le fichier
2 ... Décryper le fichier
0 ... Quitter
0
fin
*/ 

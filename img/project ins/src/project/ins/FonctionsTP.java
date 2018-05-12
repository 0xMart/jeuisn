/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ins;

import java.util.Scanner;

/**
 *
 * @author maxime.dangelser
 */
public class FonctionsTP {
        int NbArbre = 0;
        int NbPoubelle = 0;
        int NbCentreDeTri = 0;
        int NbEolienne = 0;
        int NbBarrage = 0;
        int NbTranspCom = 0;
        int NbProjetsEnvNat = 0;
        int NbProjetsEnvPla = 0;
        int NbRobotsNettOc = 0;
        int NbRobotsNettEsp = 0;

    public  int PlanterUnArbre(int compteur1)
    {
        int PrixArbre;
        PrixArbre = NbArbre + (NbArbre + 15);
        if(PrixArbre < compteur1)
        {
                compteur1 = compteur1 - PrixArbre;
                NbArbre++;
                System.out.println("Vous avez planter un arbre");
                System.out.println("Il vous reste de l'argent");
        }
        if(PrixArbre == compteur1)
        {
            compteur1 = 0;
            NbArbre++;
            System.out.println("Vous avez planter un arbre mais vous n'avez plus d'argent aha...");
            System.out.println("Pardon, c'est pas bien de se moquer des pauvres");
        }
        if(PrixArbre > compteur1)
        {
            System.out.println("Aha! Vous avez même pas d'argent pour faire planter un Arbre");
            System.out.println("par un petit Népalais...");
            System.out.println("A plus !");
        }
        return NbArbre;
    }
    
    public  int AcheterPoubelle(int compteur1)
    {
        int PrixPoubelle;
        PrixPoubelle = NbPoubelle + 50;
        if(PrixPoubelle < compteur1)
        {
                compteur1 = compteur1 - PrixPoubelle;
                NbPoubelle++;
                System.out.println("Vous avez acheter une poubelle");
                System.out.println("Il vous reste de l'argent");
        }
        if(PrixPoubelle == compteur1)
        {
            compteur1 = 0;
            NbPoubelle++;
            System.out.println("Vous avez acheter une poubelle mais vous n'avez plus d'argent aha...");
            System.out.println("Pardon, c'est pas bien de se moquer des pauvres");
            System.out.println("Mais en même temps t'a payer "+PrixPoubelle+" pour une poubelle");
        }
        if(PrixPoubelle > compteur1)
        {
            System.out.println("Aha! Vous avez même pas d'argent pour acheter une poubelle");
            System.out.println("crée par un petit Chinois");
            System.out.println("A plus !");
        }
        return NbPoubelle;
    }
    
    public  int CreerCentreDeTri(int compteur1)
    {
        int PrixCentreTri;
        PrixCentreTri = NbCentreDeTri + 200;
        if(PrixCentreTri < compteur1)
        {
                compteur1 = compteur1 - PrixCentreTri;
                NbCentreDeTri++;
                System.out.println("Vous avez construit un Centre de tri !");
                System.out.println("C'est plutot un gros investissement, bravo !");
        }
        if(PrixCentreTri == compteur1)
        {
            compteur1 = 0;
            NbCentreDeTri++;
            System.out.println("Vous avez construit un Centre de tri mais vous n'avez plus d'argent aha...");
            System.out.println("Vite il faut que vous en retrouviez, parce qu'il faut s'occuper des déchets maintenant");
        }
        if(PrixCentreTri > compteur1)
        {
            System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
            System.out.println("consruire un centre de tri Indien");
            System.out.println("A plus !");
        }
        return NbCentreDeTri;
    }
    
    public  int ConstruireEolienne(int compteur1)
    {
        int PrixEolienne;
        PrixEolienne = NbEolienne + 200;
        if(PrixEolienne < compteur1)
        {
                compteur1 = compteur1 - PrixEolienne;
                NbEolienne++;
                System.out.println("Vous avez construit une éolienne !");
                System.out.println("Grâce à vous, il y a des chinois qui ont accès à l'électricité");
        }
        if(PrixEolienne == compteur1)
        {
            compteur1 = 0;
            NbEolienne++;
            System.out.println("Vous avez construit une éolienne, mais vous n'avez plus d'argent !!!!!");
            System.out.println("Vite il faut que vous en retrouviez, parce qu'il faut créer de l'électricité maintenant");
        }
        if(PrixEolienne > compteur1)
        {
            System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
            System.out.println("consruire une éolienne.");
            System.out.println("A plus !");
        }
        return NbEolienne;
    }
    
    public int ConstruireBarrage(int compteur1)
    {
        int PrixBarrage;
        PrixBarrage = NbBarrage + 200;
        if(PrixBarrage < compteur1)
        {
                compteur1 = compteur1 - PrixBarrage;
                NbBarrage++;
                System.out.println("Vous avez construit un barrage !");
                System.out.println("Grâce à vous, il y a des Egyptiens qui ont accès à l'électricité");
        }
        if(PrixBarrage == compteur1)
        {
            compteur1 = 0;
            NbBarrage++;
            System.out.println("Vous avez construit un barrage, mais vous n'avez plus d'argent !!!!!");
            System.out.println("Vite il faut que vous en retrouviez, parce qu'il faut créer de l'électricité maintenant");
        }
        if(PrixBarrage > compteur1)
        {
            System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
            System.out.println("consruire un barrage.");
            System.out.println("A plus !");
        }
        return NbBarrage;
    }
    
    
    
    public int  CréerUnTransportCommun(int compteur1)
    {
        int PrixTranspCom;
        PrixTranspCom = NbTranspCom + 200;
        if(PrixTranspCom < compteur1)
        {
                compteur1 = compteur1 - PrixTranspCom;
                NbTranspCom++;
                System.out.println("Vous avez créer un transport en commun !");
                System.out.println("Grâce à vous, il y a des Marocains qui peuvent se déplacer sans stéréotypes");
        }
        if(PrixTranspCom == compteur1)
        {
            compteur1 = 0;
            NbTranspCom++;
            System.out.println("Vous avez créer un transport en commun, mais vous n'avez plus d'argent !!!!!");
            System.out.println("Vite il faut que vous en retrouviez, parce qu'il faut créer plus de moyens de transports maintenant");
        }
        if(PrixTranspCom > compteur1)
        {
            System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
            System.out.println("créer des transports en communs.");
            System.out.println("A plus !");
        }
        return NbTranspCom;
    }
    
    
    public  int CreerProjetEnvNational(int compteur1)
    {
        int PrixEnvNat;
        NbProjetsEnvNat = NbProjetsEnvNat + 200;
        String NomPays[] = {"Afghanistan", "Afrique du Sud", "Allemagne", "Argentine", "Australie", "Bangladesh", "Belgique", "Benin", "Bolivie", "Botswana", "Bresil", "Bulgarie"," Cambodge", "Chili", "Chine", "Chypre", "Colombie", "Congo", "Croatie", "Cuba", "Danemark", "Djibouti", "Dominique", "Egypte", "Espagne", "Estonie", "Ethiopie", "Etats-Unis d'Amerique", "Fidji", "Finlande", "France", "Gabon", "Gambie", "Georgie", "Ghana", "Grece", "Grenade", "Guatemala", "Guinee", "Guyana", "Honduaras", "Honfrie", "Inde", "Indonésie", "Irak", "Irlande", "Islande", "Israel", "Italie", "Japon", "Jordanie", "Kazakstan", "Kenya", "Kirghistan", "Koweit", "Laos", "Lettonie", "Liberia", "Libye", "Luxembourg", "Madagascar", "Mali", "Maroc", "Maurice", "Mauritanie", "Mexique", "Mozambique", "Monténégro", "Namibie", "Népal", "Nicaragua", " Niger", "Nigeria", "Norvege", "Oman", "Ouganda", "Ouzbekistan", "Pakistan", "Panama", "Papouasie", "Paraguay", "Paradisia", "Pizzaland", "Perou", "Pologne", "Portugal", "Qatar", "Royaume-Uni", "Rwanda", "Saint-Marin", "Saint-Viencent et les Grenadines", "Samoa", "Serbie", " Sierra Leone", "Singapour", "Slovaquie", "Somalie", "Soudan", "Soudan du Sud", "Sri Lanka", "Suisse", "Suede", "Tadjikistan", "Tchad", "Thailande", "Togo", "Tunisie", "Turquie", "Yemen", "Zambie", "Zimbabwe"};
        if(NbProjetsEnvNat < compteur1)
        {
                compteur1 = compteur1 - NbProjetsEnvNat;
                NbProjetsEnvNat++;
                String NPays = NomPays[NbProjetsEnvNat];
                System.out.println("Vous avez crée un projet environnemental au niveau national !");
                System.out.println("Grâce à vous,le pays :"+ NPays +"est moins pollué");
        }
        if(NbProjetsEnvNat == compteur1)
        {
            compteur1 = 0;
            NbProjetsEnvNat++;
            System.out.println("Vous avez crée un projet environnemental mais vous n'avez plus d'argent aha...");
            System.out.println("Vite il faut que vous en retrouviez, parce qu'il faut s'occuper de l'environnement maintenant");
        }
        if(NbProjetsEnvNat > compteur1)
        {
            System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
            System.out.println("créer un projet environnemental au niveau national");
            System.out.println("A plus !");
        }
        return NbProjetsEnvNat;
        
    }
    
    public int CreerProjetEnvPlanétaire(int compteur1)
    {
        NbProjetsEnvPla = NbProjetsEnvPla + 200;
        if(NbProjetsEnvPla < compteur1)
        {
                compteur1 = compteur1 - NbProjetsEnvPla;
                NbProjetsEnvPla++;
                System.out.println("Vous avez crée un projet environnemental planétaire !");
                System.out.println("Grâce à vous, la Terre se porte mieux !");
        }
        if(NbProjetsEnvPla == compteur1)
        {
            compteur1 = 0;
            NbProjetsEnvPla++;
            System.out.println("Vous avez crée un projet environnemental planétaire mais vous n'avez plus d'argent aha...");
            System.out.println("Vite il faut que vous en retrouviez, parce quq'il faut s'occuper de l'environnement maintenant");
        }
        if(NbProjetsEnvPla > compteur1)
        {
            System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
            System.out.println("créer un projet environnemental au niveau planétaire");
            System.out.println("A plus !");
        }
        return NbProjetsEnvPla;
    }
    
    public  int ConstruireRobotsNettOceans(int compteur1)
    {
        NbRobotsNettOc = NbRobotsNettOc + 200;
        if(NbRobotsNettOc < compteur1)
        {
                compteur1 = compteur1 - NbRobotsNettOc;
                NbRobotsNettOc++;
                System.out.println("Vous avez construit un Robot pour nettoyer un océan !");
                System.out.println("Grâce à vous, les poissons ne sont plus obligé de trier les déchets tous seuls.");
        }
        if(NbRobotsNettOc == compteur1)
        {
            compteur1 = 0;
            NbRobotsNettOc++;
            System.out.println("Vous avez construit un Robot pour nettoyer un océan mais vous n'avez plus d'argent aha...");
            System.out.println("Vite il faut que vous en retrouviez, parce quq'il faut s'occuper des carcasses de bateau maintenant");
        }
        if(NbRobotsNettOc > compteur1)
        {
            System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
            System.out.println("consruire un Robot Vietnamien");
            System.out.println("A plus !");
        }
        return NbRobotsNettOc;
    }
    
    public int ConstruireRobotsNettEspaces(int compteur1)
    {
        NbRobotsNettEsp = NbRobotsNettEsp + 200;
        if(NbRobotsNettEsp < compteur1)
        {
                compteur1 = compteur1 - NbRobotsNettEsp;
                NbRobotsNettEsp++;
                System.out.println("Vous avez construit un Robot pour nettoyer l'espace !");
                System.out.println("Grâce à vous, partir de la terre n'est plus un jeu de slalom");
        }
        if(NbRobotsNettEsp == compteur1)
        {
            compteur1 = 0;
            NbRobotsNettEsp++;
            System.out.println("Vous avez construit un Robot pour nettoyer l'espace mais vous n'avez plus d'argent aha...");
            System.out.println("Vite il faut que vous en retrouviez, parce quq'il faut s'occuper des morceaux de satellites maintenant");
        }
        if(NbRobotsNettEsp > compteur1)
        {
            System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
            System.out.println("consruire un Robot Suisse");
            System.out.println("A plus !");
        }
        return NbRobotsNettEsp;
    }
    
    /*public static void main(String[] args) 
    {
        Scanner entrée = new Scanner(System.in);
        //Appelle des variables
        int Quitter = 0;
        int Achats;
        int Recommencer = 0;
        int compteur1 = 0;
        int NbArbre = 0;
        int NbPoubelle = 0;
        int NbCentreDeTri = 0;
        int NbEolienne = 0;
        int NbBarrage = 0;
        int NbTranspCom = 0;
        int NbProjetsEnvNat = 0;
        int NbProjetsEnvPla = 0;
        int NbRobotsNettOc = 0;
        int NbRobotsNettEsp = 0;
        
        //Appelle de la fonction cliqueur
        
        
        //Appelle des fonctions pour automatiser
        do
        {
            System.out.println("Voulez-vous ");
            System.out.println("1. Cliquez");
            System.out.println("2. Acheter");
            System.out.println("3. Quitter");
            Quitter = entrée.nextInt();
            if(Quitter == 1)
            {
                
            }
            if(Quitter == 2)
            {
                while(Recommencer == 0)
                {
                    System.out.println("Quel objet voulez-vous acheter ?");
                    System.out.println(" 1. Un Arbre à planter !");
                    System.out.println(" 2. Une Poubelle !");
                    System.out.println(" 3. Un Centre de Tri !");
                    System.out.println(" 4. Une Eolienne !");
                    System.out.println(" 5. Un Barrage !");
                    System.out.println(" 6. Un Moyen de Transport en commun !");
                    System.out.println(" 7. Un Projet Environnemental de niveau National !");
                    System.out.println(" 8. Un Projet Environnemental de niveau Mondial !");
                    System.out.println(" 9. Un Robot pour Nettoyer les Océans !");
                    System.out.println("10. Un Robot pour Nettoyer l'Espace !");
                    System.out.print(": ");
                    Achats = entrée.nextInt();
                    if(Achats == 1)
                    {
                        //PlanterUnArbre(compteur1, NbArbre);
                    }
                    if(Achats == 2)
                    {
                        AcheterPoubelle(compteur1, NbPoubelle);
                    }
                    if(Achats == 3)
                    {
                        CreerCentreDeTri(compteur1, NbCentreDeTri);
                    }
                    if(Achats == 4)
                    {
                        ConstruireEolienne(compteur1, NbEolienne);
                    }
                    if(Achats == 5)
                    {
                        ConstruireBarrage(compteur1, NbBarrage);
                    }
                    if(Achats == 6)
                    {
                        CréerUnTransportCommun(compteur1, NbTranspCom);
                    }
                    if(Achats == 7)
                    {
                        CreerProjetEnvNational(compteur1, NbProjetsEnvNat);
                    }
                    if(Achats == 8)
                    {
                        CreerProjetEnvPlanétaire(compteur1, NbProjetsEnvPla);
                    }
                    if(Achats == 9)
                    {
                        ConstruireRobotsNettOceans(compteur1, NbRobotsNettOc);
                    }
                    if(Achats == 10)
                    {
                        ConstruireRobotsNettEspaces(compteur1, NbRobotsNettEsp);
                    }
                    System.out.println("Voulez-vous encore faire des Achats ?");
                    System.out.println("Oui : 0");
                    System.out.println("Non : 1");
                    System.out.print(": ");
                    Recommencer = entrée.nextInt();
                }
            }
        }while(Quitter == 0 || Quitter == 1 || Quitter == 2);
    }*/
    
}


package com.websystique.springbatch.model;


import lombok.Data;
import org.joda.time.LocalDate;


@Data
public class Prelevement {
    private String id_LS;
    private String num_dossier;
    private String code_evenement;
    private String code_Famille_Pret;
    private String code_produit;
    private String code_Societe;
    private String mode_Prlv;
    private LocalDate date_Echeance;
    private String num_Compte;
    private double montant_Echeance;
    private double montant_Capital;
    private double montant_Interet;
    private double montant_Ass;
}



   /* les valeurs not null
    code_evenement ===>  mode_Prlv
    date_prelevement ===>  date_Echeance
    code_produit
    */
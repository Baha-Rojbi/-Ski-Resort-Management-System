package tn.etudedecas.stationdeski.Services;

import jakarta.persistence.criteria.CriteriaBuilder;
import tn.etudedecas.stationdeski.Entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    public Inscription addInscription(Inscription inscription);
    public Inscription updateInscription(Inscription inscription);
    public List<Inscription> retrieveAllInscriptions();
    public Inscription retrieveInscription(long numInscription);
    public void deleteInscription(long numInscription);
    public Inscription addInscriptionAndAssignToSkieur(Inscription inscription,Long numSkieur);
    public Inscription addInscriptionAndAssignToCours(Inscription inscription,Long numCours);
}

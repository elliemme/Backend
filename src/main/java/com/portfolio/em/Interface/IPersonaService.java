package com.portfolio.em.Interface;

import com.portfolio.em.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersona();
    public void savePersona(Persona persona);
    public void deletePersona(int id);
    public Persona findPersona(int id);
}

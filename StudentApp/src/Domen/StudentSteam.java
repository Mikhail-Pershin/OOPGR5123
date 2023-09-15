package Domen;

import java.util.Iterator;
import java.util.List;


public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> steam;
    private Integer idSteam;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * 
     * @param stream            - поток
     * @param idStream         - id-потока
     * @see StudentSteam#StudentSteam()
     */
    public StudentSteam(List<StudentGroup> stream, Integer idSteam, List<StudentGroup> list) {
      this.steam = steam;
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getStream() {
        return steam;
    }

    public void setStream(List<StudentGroup> stream) {
        this.steam = stream;
    }

    public Integer getIdStream() {
        return idSteam;
    }

    public void setIdStream(Integer idStream) {
        this.idSteam = idStream;
    }

    @Override
    public String toString() {
        return "StudentSteam. " + "Поток № " + idSteam + ": " + steam;
    }

    /**
     * Переопределение метода toString.
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return steam.iterator();
    }

}
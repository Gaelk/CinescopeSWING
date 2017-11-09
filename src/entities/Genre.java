/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author formation
 */
public class Genre {
    private int idGenre;
    private String codegenre;
    private String libelleGenre;
    private String genreGrammatical;

    public Genre() {
    }

    
    public Genre(int idGenre, String codegenre, String libelleGenre, String genreGrammatical) {
        this.idGenre = idGenre;
        this.codegenre = codegenre;
        this.libelleGenre = libelleGenre;
        this.genreGrammatical = genreGrammatical;
    }
    
    
}

package com.activite.un;

/** Classe Produit repr�sentant un.
 * produit avec un prix et une r�f�rence. */
public class Produit {
/** String reference. **/
private String reference;
/** double prix. **/
private double prix;
//double tva = 0.20;

/**
 * @author MARCO
 * @param lReference
 */
public Produit(final String lReference) {
this.reference = lReference;
}

/** @param lReference
 * */
public final void setReference(final String lReference) {
this.reference = lReference;
}

/** @return le prix. */
public double getPrix() {
return this.prix;
}

/** modifie le prix.
*  @param lPrix
**/
public final void setPrix(final Double lPrix) {
this.prix = lPrix;
}

/**
* @return la reference si le prix est positif, null sinon.
*/
public final String getReference() {
return reference;
}

/**
* @return reference si le produit.
* correspond � l'objet pass� en param�tre
*/
@Override
public boolean equals(final Object object) {
boolean bool;
if (object == null) {
bool = false;
} else {
bool = this.reference.equals(((Produit) object).reference);
}
return bool;
}

/**
* @return reference hash�e
*/
@Override
public int hashCode() {
return this.getReference().hashCode();
}

}

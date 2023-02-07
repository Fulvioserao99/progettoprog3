/*
Record creato basandosi sul lavoro di zFoxer.
Tale record crea una associazione di valori, che verra' utilizzata
nella mappatura degli archi e dei pesi.
*/
/**
 * Record per una coppia chiave-valore.
 * @param l item sinistro.
 * @param r item destro.
 * L e R rendono il record un "template"
 */
record Pair<L, R>(L l, R r)
{
    /**
     * Asserzione che termina il programma qualora l o r siano null
     * @param l lato sinistro.
     * @param r lato destro.
     */
    Pair
    {
        assert l != null;
        assert r != null;
    }


    public L getLeft()
    {
        return l;
    }

    public R getRight()
    {
        return r;
    }

    /**
     * Metodologia della codifica hash
     * @return int codice hash.
     */
    @Override
    public int hashCode()
    {
        return l.hashCode() ^ r.hashCode();
    }

    /**
     * Override di equals per controllare l'uguaglianza tra oggetti
     * @param obj il reference all'oggetto col quale si sta eseguendo il confronto
     * @return true se uguale.
     */
    @Override
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Pair))
            return false;

        Pair pairObj = (Pair)obj;
        return this.l.equals(pairObj.getLeft()) && this.r.equals(pairObj.getRight());
    }
}

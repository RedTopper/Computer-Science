
/**
 * Write a description of class Translate here.
 * No.
 * @author 1714057
 * @version 13 nov 2014
 */
public class Translate
{
    private String translated = "";
    private String original = "";
    private String[] englishSpeak = {"hello","is that","sir"  ,"where is","excuse me","money","chest" ,"coin"    ,"you are","reading" ,"testing"               ,"my friends","i am","translator"   ,"these","mean"  ,"Ah!" ,"Stop!" ,"Yes!"};
    private String[] pirateSpeak =  {"ahoy" ,"be that","matey","whar be" ,"arrr"     ,"booty","coffer","doubloon","you be" ,"readin\'","sailing the seven seas","me maties" ,"i be","translatarr\'","ye"   ,"scurvy","Arr!","Avast!","Aye!"};
    public Translate(String _str, boolean _isPirate)
    {
        original = _str;
        translated = translate(_str, _isPirate);
    }
    public String translate(String str, boolean isPirate)
    {
        str = str.trim();
        str = str.toLowerCase();
        int word = 0;
        if(isPirate == false)
        {
            for(String translate : englishSpeak)
            {
                for(int i = 0; i < str.length(); i++)
                {
                    if(str.indexOf(translate, i) > -1)
                    {
                        i = str.indexOf(translate, i) + 1;
                        str = str.substring(0,str.indexOf(translate)) + pirateSpeak[word] + str.substring(str.indexOf(translate) + englishSpeak[word].length());
                    }
                }
                word++;
            }
        }
        else
        {
            for(String translate : pirateSpeak)
            {
                for(int i = 0; i < str.length(); i++)
                {
                    if(str.indexOf(translate, i) > -1)
                    {
                        i = str.indexOf(translate, i) + 1;
                        str = str.substring(0,str.indexOf(translate)) + englishSpeak[word] + str.substring(str.indexOf(translate) + pirateSpeak[word].length());
                    }
                }
                word++;
            } 
        }
        str = str.substring(0,1).toUpperCase() + str.substring(1);
        return str;
    }
    public boolean equals(Translate translateobj)
    {
        if(translateobj.getOriginalPhrase().equals(getTranslatedPhrase()))
            return true;
        if(translateobj.getTranslatedPhrase().equals(getTranslatedPhrase()))
            return true;
        if(translateobj.getOriginalPhrase().equals(getOriginalPhrase()))
            return true;
        if(translateobj.getTranslatedPhrase().equals(getOriginalPhrase()))
            return true;
        return false;
    } 
    public String getTranslatedPhrase()
    {
        return translated;
    }
    public String getOriginalPhrase()
    {
        return original.substring(0,1).toUpperCase() + original.substring(1);
    }
}

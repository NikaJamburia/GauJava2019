package gau.nika.util;


    public enum Lang{
        EN("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"),
        GE("აბგდევზთიკლმნოპჟრსტუფქღყშჩცძწჭხჯჰ"),
        RU("АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя");

        public final String vocab;
        Lang(String vocab){
            this.vocab = vocab;
        }
    }




package com.cona.ohs.koreanquiz;

import android.os.AsyncTask;

/**
 * Created by hyeonseok on 2016. 7. 21..
 */
public class KoreanWordAPITask extends AsyncTask<Integer, Void, KoreanWord> {
    @Override
    protected KoreanWord doInBackground(Integer... integers) {
        if (integers.length > 0){
            int id = integers[0];
            return KoreanWordAPIClient.getKoreanWord(id);
        }
        else{
            return KoreanWordAPIClient.getKoreanWord();
        }
    }
}

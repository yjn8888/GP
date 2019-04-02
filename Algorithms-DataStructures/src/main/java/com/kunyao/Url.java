package com.kunyao;

import sun.net.www.protocol.https.HttpsURLConnectionImpl;

import sun.net.www.protocol.http.HttpURLConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Url {

    public static void main(String[] args) throws IOException {
        HttpURLConnection httpURLConnection;
        httpURLConnection = new HttpURLConnection(new URL(URLEncoder.encode("http://htsit.hanhua.com/dcloud/api/v1/document/download?docid=C9F1EDD4-F5CE-4EB5-83F3-589CB2931CA6&filename=微信图片_20190314183759.jpg","UTF-8")));
        httpURLConnection.connect();
        httpURLConnection.disconnect();
    }
}

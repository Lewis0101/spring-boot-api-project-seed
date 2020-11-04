package org.lewis.management.system.common.utils;

import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/20
 */
@Slf4j
@Component
public class Base64Util {

    /**
     * 通过URL获取base64字符串
     */
    public String getBase64ByUrl(URL url) {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(5000);

            InputStream in = urlConnection.getInputStream();
            byte[] buff = new byte[1024];
            int len;
            while ((len = in.read(buff)) != 0) {
                out.write(buff, 0, len);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return Base64.getEncoder().encodeToString(out.toByteArray());
    }
}

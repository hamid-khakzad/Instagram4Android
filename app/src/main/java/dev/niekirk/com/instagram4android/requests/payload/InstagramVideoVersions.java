package dev.niekirk.com.instagram4android.requests.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * Created by root on 25/09/17.
 */

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class InstagramVideoVersions {

    private String url;
    private String type;
    private float width;
    private float height;

}

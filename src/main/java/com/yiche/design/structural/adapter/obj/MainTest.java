package com.yiche.design.structural.adapter.obj;


import com.yiche.design.structural.adapter.MoviePlayer;

public class MainTest {
    public static void main(String[] args) {

        JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(new MoviePlayer());

        adapter.play();
    }

}

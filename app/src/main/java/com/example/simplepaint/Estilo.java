package com.example.simplepaint;

import android.graphics.Color;
import android.graphics.Paint;

public class Estilo {

    public static Paint getEstilosParaLinha(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.BLUE);
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(4f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }

    public static Paint getEstiloParaLinhaVerde() {
        Paint estiloLinhaVerde = new Paint();
        estiloLinhaVerde.setAntiAlias(true);
        estiloLinhaVerde.setColor(Color.GREEN);
        estiloLinhaVerde.setStyle(Paint.Style.STROKE);
        estiloLinhaVerde.setStrokeWidth(4f);
        estiloLinhaVerde.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinhaVerde;
    }

    public static Paint getEstiloLivre() {
        Paint estiloLivre = new Paint();
        estiloLivre.setAntiAlias(true);
        estiloLivre.setColor(Color.RED);
        estiloLivre.setStyle(Paint.Style.FILL);
        estiloLivre.setStrokeWidth(8f);
        estiloLivre.setStrokeJoin(Paint.Join.ROUND);
        return estiloLivre;
    }
}

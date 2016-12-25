package atirek.com.animatebutton;

/**
 * Created by Atirek on 25-12-2016.
 */

class BounceInterpolator implements android.view.animation.Interpolator {

    double amplitude = 1;
    double frequency = 10;

    BounceInterpolator(double amplitude, double frequency) {
        this.amplitude = amplitude;
        this.frequency = frequency;
    }

    public float getInterpolation(float time) {
        return (float) (-1 * Math.pow(Math.E, -time / amplitude) *
                Math.cos(frequency * time) + 1);
    }
}


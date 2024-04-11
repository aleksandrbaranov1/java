public class Car {
    private String _year_model;
    private String rttake;
    private int _speed;

    public Car (){
        _speed = 0;
    }

    public void _init_ (String _year_model, String rttake) {
        this._year_model = _year_model;
        this.rttake = rttake;
    }
    public void accelerate(){
        _speed += 5;
    }
    public void _break (){
        _speed -= 5;
    }
    public int get_speed(){
        return _speed;
    }
}

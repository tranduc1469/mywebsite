package annotation;

public abstract class  Animal {
    public abstract void makeSound();
    // Java docs
    /**
     * @deprecated Kết bạn với tao để biết thêm thông tin chi tiết {@link #eatV2()} */
    @Deprecated
    public void eat(){
    };
    public void eatV2(){};
}

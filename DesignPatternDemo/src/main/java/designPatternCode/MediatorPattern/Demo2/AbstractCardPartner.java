package designPatternCode.MediatorPattern.Demo2;

/// <summary>
/// 抽象牌友类
/// </summary>
public abstract class AbstractCardPartner {

    //public int Money {get; set;}

    public abstract void ChangeMoney(int money, AbstractCardPartner other);
}

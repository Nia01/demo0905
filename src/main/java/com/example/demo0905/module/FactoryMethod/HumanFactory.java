package com.example.demo0905.module.FactoryMethod;

/**
 * 工厂实现类
 */
public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> tClass) {
        Human human = null;

        try {
            //反射获取实例
            human =(T) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("人种产生错误");
        }

        return (T) human;
    }
}

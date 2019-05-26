package com.example.structure_mode.组合模式;

/**
 * 抽象组件
 */
public interface Component {
    void operation();
}

/**
 * 叶子组件
 */
interface Leaf extends Component {
}

/**
 * 容器组件
 */
interface Composite extends Component {
    void add(Component c);      // 添加

    void remove(Component c);   // 移除

    Component getChild(int index);  // 索引获取
}
/*
 * Copyright (c) 2021 Zhu Zerun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package male.instance;

/**
 * 单个实例
 *
 * @author Zhu Zerun
 */
public class Instance {
    /**
     * 样本特征向量
     */
    private final double[] featureValues;
    /**
     * 样本权重
     */
    private final double weight;
    /**
     * 样本真值（机器学习的目标值），对于分类问题为类别标签索引值
     */
    private final double truth;

    /**
     * 有权重训练样本构造函数
     *
     * @param featureValues 样本特征向量
     * @param weight        样本权重
     * @param truth   目标值，类别标签
     */
    public Instance(double[] featureValues, double truth, double weight) {
        this.featureValues = featureValues;
        this.weight = weight;
        this.truth = truth;
    }

    /**
     * 无权重训练样本构造函数
     *
     * @param featureValues 样本特征向量
     * @param truth   目标值，类别标签
     */
    public Instance(double[] featureValues, double truth) {
        this(featureValues, 1.0, truth);
    }

    /**
     * 获取特征向量
     *
     * @return 返回特征值数组
     */
    public double[] getFeatureValues() {
        return featureValues;
    }

    /**
     * 获取权重
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 获取目标值
     */
    public double getTruth() {
        return truth;
    }
}

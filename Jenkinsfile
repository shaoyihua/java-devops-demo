// 写Jenkins 流水线的脚本
pipeline{
    //全部的CICD流程都需要写在这里
    agent any
    //定义流水线加工流程
    stages{
    //定义流水线的所有阶段

        //1. 编译阶段
                stage('代码编译'){
                    steps{
                    //所有需要做的事情在这里定义
                        echo "代码编译"
                    }
                }
        //2.测试
                stage('TEST'){
                    steps{
                            //所有需要做的事情在这里定义
                           echo "TEST"
                                        }

                                }
        //3.打包
                stage('PACKAGE'){
                    steps{
                            //所有需要做的事情在这里定义
                           echo "PACKAGE"
                                        }

                                }
        //4.发布
                stage('发布'){
                     steps{
                             //所有需要做的事情在这里定义
                            echo "发布"
                                         }

                                }
    }
}
1.首先我们先新建一个module（我把它新建成了一个library）
2.配置将要生成Jar包的gradle
def SDK_BASENAME = "mylibs";
def SDK_VERSION = "_v1.0";
def sdkDestinationPath = "build/outputs/jar/";
def zipFile = file('build/intermediates/bundles/default/classes.jar')

task deleteBuild(type: Delete) {
    delete sdkDestinationPath + SDK_BASENAME + SDK_VERSION + ".jar"
}

task makeJar(type: Jar) {
    from zipTree(zipFile)
    from fileTree(dir: 'src/main', includes: ['assets/**'])
    baseName = SDK_BASENAME + SDK_VERSION
    destinationDir = file(sdkDestinationPath)
}
Android{
  ...
lintOptions {
        abortOnError false
    }
  ....
    }
 3.开启混淆
buildTypes {
        release {
            minifyEnabled true
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
4.编写混淆规则（项目中的proguard-rules.pro文件是混淆规则）
5.点击AndroidStudio右侧的Gradle->mylibrary->Tasks->other->makeJar(双击makeJar)生成Jar包

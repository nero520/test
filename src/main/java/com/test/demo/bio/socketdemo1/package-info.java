package com.test.demo.bio.socketdemo1;
/**
 BIO：
 在JDK1.4出来之前，我们建立网络连接的时候采用BIO模式，需要先在服务端启动一个ServerSocket，
 然后在客户端启动Socket来对服务端进行通信，默认情况下服务端需要对每个请求建立一堆线程等待请求，
 而客户端发送请求后，先咨询服务端是否有线程相应，如果没有则会一直等待或者遭到拒绝请求，
 如果有的话，客户端会线程会等待请求结束后才继续执行。

 同步并阻塞，服务器实现模式为一个连接一个线程，即客户端有连接请求时服务器端就需要启动一个线程进行处理，
 如果这个连接不做任何事情会造成不必要的线程开销，当然可以通过线程池机制改善。

 BIO优缺点：
 优点
 模型简单
 编码简单
 缺点
 性能瓶颈低

 优缺点很明显。
 这里主要说下缺点：主要瓶颈在线程上。
 每个连接都会建立一个线程。
 虽然线程消耗比进程小，但是一台机器实际上能建立的有效线程有限，
 以Java来说，1.5以后，一个线程大致消耗1M内存！
 且随着线程数量的增加，CPU切换线程上下文的消耗也随之增加，在高过某个阀值后，继续增加线程，性能不增反降！
 而同样因为一个连接就新建一个线程，所以编码模型很简单！
 就性能瓶颈这一点，就确定了BIO并不适合进行高性能服务器的开发！
 像Tomcat这样的Web服务器，从7开始就从BIO改成了NIO，来提高服务器性能！
 */
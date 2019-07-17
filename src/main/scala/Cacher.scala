import java.util

import org.apache.ignite.configuration.{CacheConfiguration, IgniteConfiguration}
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi
import org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder
import org.apache.ignite.{Ignite, IgniteCache, Ignition}


object Cacher {
  case class MyString(text: String)
  def main(args: Array[String]): Unit = {
    println("Starting...")

    val igniteCfg: IgniteConfiguration = new IgniteConfiguration()
    igniteCfg.setClientMode(true)

    val discoverySpi: TcpDiscoverySpi = new TcpDiscoverySpi()
    discoverySpi.setJoinTimeout(10000)
    val ipFinder: TcpDiscoveryVmIpFinder = new TcpDiscoveryVmIpFinder()
    val ips: util.List[String] = util.Arrays.asList("ignite")
    ipFinder.setAddresses(ips)
    discoverySpi.setIpFinder(ipFinder)
    igniteCfg.setDiscoverySpi(discoverySpi)

    val ignite: Ignite = Ignition.start(igniteCfg)
    val cacheCfg = new CacheConfiguration[String, MyString]()
    cacheCfg.setName("mystringcache")
    val cache: IgniteCache[String, MyString] = ignite.getOrCreateCache(cacheCfg)
    cache.put("a", MyString(text = "A"))
    println(cache.get("a"))
    ignite.close()
  }
}
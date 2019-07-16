import org.apache.ignite.configuration.CacheConfiguration
import org.apache.ignite.{Ignite, IgniteCache, Ignition}

object Cacher {
  case class MyString(text: String)
  def main(args: Array[String]): Unit = {
    println("Starting...")

    val ignite: Ignite = Ignition.start("ignite-spring-config.xml")
    val cacheCfg = new CacheConfiguration[String, MyString]()
    cacheCfg.setName("mystringcache")
    val cache: IgniteCache[String, MyString] = ignite.getOrCreateCache(cacheCfg)
    cache.put("a", MyString(text = "A"))
    println(cache.get("a"))
    ignite.close()
  }
}
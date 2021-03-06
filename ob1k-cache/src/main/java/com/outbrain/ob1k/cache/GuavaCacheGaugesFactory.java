package com.outbrain.ob1k.cache;

import com.google.common.cache.Cache;
import com.outbrain.swinfra.metrics.api.MetricFactory;


/**
 * Created by aronen on 2/20/14.
 * creates a set of gauges that monitors Guava cache.
 *
 */
public class GuavaCacheGaugesFactory {
  public static void createGauges(final MetricFactory metricFactory, final Cache cache, final String cacheName) {
    if (metricFactory != null) {
      metricFactory.registerGauge(cacheName, "averageLoadPenalty", () -> cache.stats().averageLoadPenalty());

      metricFactory.registerGauge(cacheName, "hitRate", () -> cache.stats().hitRate());

      metricFactory.registerGauge(cacheName, "loadExceptionRate", () -> cache.stats().loadExceptionRate());

      metricFactory.registerGauge(cacheName, "missRate", () -> cache.stats().missRate());

      metricFactory.registerGauge(cacheName, "evictionCount", () -> cache.stats().evictionCount());

      metricFactory.registerGauge(cacheName, "hitCount", () -> cache.stats().hitCount());

      metricFactory.registerGauge(cacheName, "loadCount", () -> cache.stats().loadCount());

      metricFactory.registerGauge(cacheName, "loadExceptionCount", () -> cache.stats().loadExceptionCount());

      metricFactory.registerGauge(cacheName, "loadSuccessCount", () -> cache.stats().loadSuccessCount());

      metricFactory.registerGauge(cacheName, "missCount", () -> cache.stats().missCount());

      metricFactory.registerGauge(cacheName, "requestCount", () -> cache.stats().requestCount());

      metricFactory.registerGauge(cacheName, "totalLoadTime", () -> cache.stats().totalLoadTime());

      metricFactory.registerGauge(cacheName, "size", cache::size);

    }

  }
}

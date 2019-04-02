/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc.examples.routeguide;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * A sample gRPC server that serve the RouteGuide (see route_guide.proto) service.
 */
public class RouteGuideServer {
  private static final Logger logger = Logger.getLogger(RouteGuideServer.class.getName());

//  private final int port;
//  private final Server server;
//
//  public RouteGuideServer(int port) throws IOException {
//    this(port, RouteGuideUtil.getDefaultFeaturesFile());
//  }
//
//  /** Create a RouteGuide server listening on {@code port} using {@code featureFile} database. */
//  public RouteGuideServer(int port, URL featureFile) throws IOException {
//    this(ServerBuilder.forPort(port), port, RouteGuideUtil.parseFeatures(featureFile));
//  }
//
//  /** Create a RouteGuide server using serverBuilder as a base and features as data. */
//  public RouteGuideServer(ServerBuilder<?> serverBuilder, int port, Collection<Feature> features) {
//
//  }

  /** Start serving requests. */
  public void start() throws IOException {

  }

  /** Stop serving requests and shutdown resources. */
  public void stop() {
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
  }

  /**
   * Main method.  This comment makes the linter happy.
   *
   * Start the server at port 8090. And hold the server running unless it was asked to shutdown
   */
  public static void main(String[] args) throws Exception {

  }

  /**
   * Our implementation of RouteGuideService.
   *
   * <p>See route_guide.proto for details of the methods.
   */




    /**
     * Implement getFeature(Point, StreamObserver)
     *
     * Gets the {@link Feature} at the requested {@link Point}. If no feature at that location
     * exists, an unnamed feature is returned at the provided location.
     *
     * @param request the requested location for the feature.
     * @param responseObserver the observer that will receive the feature at the requested point.
     */



    /**
     * Implement listFeatures(Rectangle, StreamObserver)
     *
     * Gets all features contained within the given bounding {@link Rectangle}.
     *
     * @param request the bounding rectangle for the requested features.
     * @param responseObserver the observer that will receive the features.
     */




    /**
     * Implement recordRoute(StreamObserver): onNext, onError, and onCompleted
     *
     * Gets a stream of points, and responds with statistics about the "trip": number of points,
     * number of known features visited, total distance traveled, and total time spent.
     *
     * @param responseObserver an observer to receive the response summary.
     * @return an observer to receive the requested route points.
     */




    /**
     * Implement routeChat(StreamObserver): onNext, onError, and onCompleted
     *
     * Receives a stream of message/location pairs, and responds with a stream of all previous
     * messages at each of those locations.
     *
     * @param responseObserver an observer to receive the stream of previous messages.
     * @return an observer to handle requested message/location pairs.
     */




    /**
     * Get the notes list for the given location. If missing, create it.
     */
//    private List<RouteNote> getOrCreateNotes(Point location) {
//      List<RouteNote> notes = Collections.synchronizedList(new ArrayList<RouteNote>());
//      List<RouteNote> prevNotes = routeNotes.putIfAbsent(location, notes);
//      return prevNotes != null ? prevNotes : notes;
//    }

    /**
     * Gets the feature at the given point.
     *
     * @param location the location to check.
     * @return The feature object at the point. Note that an empty name indicates no feature.
     */
//    private Feature checkFeature(Point location) {
//      for (Feature feature : features) {
//        if (feature.getLocation().getLatitude() == location.getLatitude()
//            && feature.getLocation().getLongitude() == location.getLongitude()) {
//          return feature;
//        }
//      }
//
//      // No feature was found, return an unnamed feature.
//      return Feature.newBuilder().setName("").setLocation(location).build();
//    }

    /**
     * Calculate the distance between two points using the "haversine" formula.
     * The formula is based on http://mathforum.org/library/drmath/view/51879.html.
     *
     * @param start The starting point
     * @param end The end point
     * @return The distance between the points in meters
     */
//    private static int calcDistance(Point start, Point end) {
//      int r = 6371000; // earth radius in meters
//      double lat1 = toRadians(RouteGuideUtil.getLatitude(start));
//      double lat2 = toRadians(RouteGuideUtil.getLatitude(end));
//      double lon1 = toRadians(RouteGuideUtil.getLongitude(start));
//      double lon2 = toRadians(RouteGuideUtil.getLongitude(end));
//      double deltaLat = lat2 - lat1;
//      double deltaLon = lon2 - lon1;
//
//      double a = sin(deltaLat / 2) * sin(deltaLat / 2)
//          + cos(lat1) * cos(lat2) * sin(deltaLon / 2) * sin(deltaLon / 2);
//      double c = 2 * atan2(sqrt(a), sqrt(1 - a));
//
//      return (int) (r * c);
//    }
}